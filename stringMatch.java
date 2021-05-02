public byte stringMatch(String a, String b) {
  byte nbLen2=0;
  if(a.length()>=2 && b.length()>=2) {
    byte minLen = (byte)((a.length()<b.length())?a.length():b.length());
    for(byte i=0; i<minLen-1; i++) {
      if(a.substring(i,i+2).equals(b.substring(i,i+2))) nbLen2++;
  }
  return nbLen2;
}
