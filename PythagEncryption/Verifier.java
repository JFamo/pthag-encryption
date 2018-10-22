public class Verifier {
    private Key private_key, public_key;
    private long asqrd, bsqrd, csqrd;
    private long a,b,c;
    
    public Verifier(Key private_key, Key public_key){
        this.private_key = private_key;
        this.public_key = public_key;
    }
    
    public boolean verify(Key checker_key){
        a = Long.parseLong(private_key.getValue());
        asqrd = a * a;
        b = Long.parseLong(checker_key.getValue());
        bsqrd = b * b;
        c = Long.parseLong(public_key.getValue());
        csqrd = c * c;
        if(asqrd + bsqrd == csqrd){
            return true;
        }
        return false;
    }
}