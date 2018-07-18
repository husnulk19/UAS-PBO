public class datas {  
    protected String namalkp, ttl, nktp;
    public datas (){}
    public datas (String namalkp, String ttl, String nktp){     
		this.namalkp = namalkp;
		this.ttl = ttl;
		this.nktp = nktp;        
	}
    public void setnamal(String namalkp){
		this.namalkp = namalkp;        
    }
    public String getnamal(){
        return namalkp;        
    }
    public void setttl(String ttl){
        this.ttl = ttl;        
    }
    public String getttl(){
      return ttl;        
    }
    public void setnktp (String nktp){
        this.nktp = nktp;
    }
    public String getnktp(){
        return nktp;
    }
}