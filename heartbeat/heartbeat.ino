void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  int n = millis(); 
Serial.println(n/1000 + " sec have elapsed");
delay(1001);
}
