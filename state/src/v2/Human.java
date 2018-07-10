package v2;

class Human {

    private Activity state;

    void setState(Activity state) {
        this.state = state;
    }

    void go(){
        state.doSmth(this);
    }
}
