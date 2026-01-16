class Greeter {
    String getGreeting() {
        return "Hello, World!";
    }
}

class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
    }
}
