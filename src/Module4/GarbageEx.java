package Module4;

 class GarbageEx {

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Garbage Collected!");
        }

        public static void main(String[] args) {

            // Creating objects
            GarbageEx obj1 = new GarbageEx();
            GarbageEx obj2 = new GarbageEx();

            obj1 = null;
            obj2 = null;

            System.gc();

            System.out.println("End of main method");
        }
    }

