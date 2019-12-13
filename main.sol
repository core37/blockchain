pragma solidity ^0.4.4;

// import "Evidence.sol";



contract main{
    struct company{
        uint id;
	    string name;
	    string info;
    }//记录执行对象实体
    struct receipt{
        uint id;
	    uint fr;//支付方
        uint to;//收款方
        uint mount;//金额
        bool bankMortgage;//银行融资
    }
    uint totalrec = 0;
    uint totalcom = 0;
    company[] listOfCompany;
    receipt[] listOfReceipt;
    function createAccount(string name, string info) public returns(uint){

        listOfCompany.push(company(totalcom, name, info));
        totalcom ++;
        return (totalcom - 1);
    }

    function createReceipt(uint fr, uint to, uint mount, bool bankMortgage) public returns(uint){
        listOfReceipt.push(receipt(totalrec, fr, to, mount, bankMortgage));
        totalrec ++;
        return (totalrec - 1);
    }
    function showReceiptMountById(uint id) public returns(uint){
        return (listOfReceipt[id].mount);
    }
    
    function showReceiptfrById(uint id) public returns(uint){
        return (listOfReceipt[id].fr);
    }
    function showReceipttoById(uint id) public returns(uint){
        return (listOfReceipt[id].to);
    }
    function showReceiptbankById(uint id) public returns(bool){
        return (listOfReceipt[id].bankMortgage);
    }


    function transferReceipt(uint rid, uint tc, uint mount) public returns(uint)
    {

        listOfReceipt[rid].mount -= mount;
        listOfReceipt.push(receipt(totalrec, listOfReceipt[rid].fr, tc, mount, listOfReceipt[rid].bankMortgage));
        totalrec ++;
        return (totalrec - 1);
    }

    function bankMortgage(uint rid) public returns(uint){
        listOfReceipt[rid].bankMortgage = true;
        return (rid);
    }
    function payReceipt(uint rid, uint mount) public returns(uint){
        listOfReceipt[rid].mount -= mount;
        return (listOfReceipt[rid].mount);
    }
}