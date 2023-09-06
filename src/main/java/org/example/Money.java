package org.example;

public class Money {



    private  long hryvnia;

    private byte kopecks;

    public long getHryvnia() {
        return hryvnia;
    }
    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }
    public Money(){
        this.hryvnia= 10;
        this.kopecks=15;
    }
    public Money(long hryvnia, byte kopecks){
        this.hryvnia=hryvnia;
        this.kopecks=kopecks;
    }

    public Money plus(Money money){

        Money result= new Money(this.hryvnia + money.hryvnia, this.kopecks);
        return result;
    }
    public Money minus(Money money){
        Money result=new Money(this.hryvnia - money.hryvnia, this.kopecks);
        return result;
    }
    public Money multiplication(Money money){

        Money result=new Money(this.hryvnia * money.hryvnia, (byte)(this.hryvnia * money.kopecks));
        return result;
    }
    public Money dvision(Money money){

        Money result = new Money(this.hryvnia * money.kopecks, (byte) (this.hryvnia * money.kopecks));
        return result;
    }

    public void comparison(){
        long div=0;
        if(this.hryvnia < this.kopecks){
            div=this.hryvnia;
        }else {
            div=this.kopecks;
        }
        for(long i=div; i>1; i++){
            if(this.hryvnia %i==0 && this.kopecks %i==0){
                this.kopecks/=i;
                this.hryvnia/=i;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return hryvnia +"/"+ kopecks;
    }
}
