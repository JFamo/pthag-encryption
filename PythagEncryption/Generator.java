public class Generator{
    private long m, n;
    private Key private_key, public_key;
    
    public Generator(){
        m = generateLong();
        n = generateLong();
    }
    
    //generate private and public key using Euclid's method
    //a = m^2 - n^2
    //b = 2mn
    //c = m^2 + n^2
    public void createKeys(){
        private_key = new Key(""+(2*m*n));
        public_key = new Key(""+(Math.pow(m,2) + Math.pow(n,2)));
    }
    
    //generate a random Long
    public long generateLong() {
        long leftLimit = 1L;
        long rightLimit = 10L;
        return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }
    
    //get private key
    public Key getPrivateKey(){
        return private_key;
    }
    
    //get private key
    public Key getPublicKey(){
        return public_key;
    }
}