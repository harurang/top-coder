public class ABBA {
  public String canObtain(String initial, String target) {
    if(initial.equals(target))
      return "possible";

    StringBuilder temporaryInitialA = new StringBuilder(initial);
    StringBuilder temporaryInitialB = new StringBuilder(initial);
    StringBuilder temporaryTarget = new StringBuilder(target);

    if(initial.length() < target.length()) {
      temporaryInitialB.reverse();
      temporaryInitialB.append("B");

      // if initial + B and then reversed equals part of the temporaryTarget
      temporaryInitialB.toString().equals(temporaryTarget.substring(0, (temporaryInitialB.length())).toString());
      if((canObtain(temporaryInitialB.toString(), target)).equals("possible")) {
        return "possible";
      }
      // if intial + A equals part of temporaryTarget
      temporaryInitialA.append("A").toString().equals(temporaryTarget.substring(0, (temporaryInitialA.length())).toString());
      if(canObtain(temporaryInitialA.toString(), target).equals("possible")) {
        return "possible";
      }
    }

    return "impossible";
  }
}
