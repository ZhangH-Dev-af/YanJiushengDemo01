package BookStudy;

class Bank {
    int account;
    int purse;

    public boolean AddMoney(int money) {
        if (money % 100 == 0 || money > 99) {
            purse += money;
            return true;
        } else {
            return false;
        }
    }
    public void lookMoney(){
        System.out.printf("账户： %d,\t余额： %d\n",account,purse);                   //知识点一
    }
}

public class ObjectStudyBank0122 {
    public static void main(String[] args) {
        Bank myAccount=new Bank();
        myAccount.account=10001;
        myAccount.purse=0;
        myAccount.lookMoney();  //存款前
        System.out.println("存款"+(myAccount.AddMoney(200)?"成功":"失败"));           //知识点二
        myAccount.lookMoney();  //存款后
    }
}
