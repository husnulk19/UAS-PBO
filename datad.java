public class datad extends datas{
    protected String jenis;
    protected String aleng;
    public datad (String namalkp, String ttl, String nktp){
        super(namalkp, ttl, nktp);
	}
    public datad(String jns, String alamat){
        this.jenis = jns;
        this.aleng = alamat;
        super.setnamal(namalkp);
        super.setttl(ttl);
        super.setnktp(nktp);        
    }
    public String getnamal(){
        return super.getnamal();        
    }
    public String getttl(){
        return super.getttl();
    }
    public String getnktp (){
        return super.getnktp();
    }
    public String getJenis(){
        return jenis;
    }
    public String getaleng(){
        return aleng;
    }
}