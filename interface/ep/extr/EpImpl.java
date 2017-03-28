
package ep.extr;

import ep.EpItf;

public class EpImpl implements EpItf {
    
    @Override
    public void create() {
        System.out.println("EpImpl - create()");
    }

    @Override
    public void update() {
        System.out.println("EpImpl - update()");
    }

    @Override
    public void delete() {
        System.out.println("EpImpl - delete()");
    }

}
