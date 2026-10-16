package com.yassine;

/**
 * @author pc
 **/
public class FilterAdapter  implements FilterStrategy{
    private ImplNonStandard oldFilterImpl;
    private String filterName;

    public FilterAdapter(ImplNonStandard oldFilterImpl, String filterName) {
        this.oldFilterImpl = oldFilterImpl;
        this.filterName = filterName;
    }


    @Override
    public int[] filter(int[] data) {
        return oldFilterImpl.appliquerFiltre(filterName, data);
    }
}
