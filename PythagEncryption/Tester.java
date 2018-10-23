public class Tester{
    public static void main(String args[]){
        Generator generator = new Generator();
        generator.createKeys();
        Key mykey = new Key(""+generator.getDecryptValue());
        Verifier verifier = new Verifier(generator.getPrivateKey(), generator.getPublicKey());
        String out = verifier.verify(mykey) ? "Verified!" : "Failed to Verify!";
        System.out.println(out);
    }
}