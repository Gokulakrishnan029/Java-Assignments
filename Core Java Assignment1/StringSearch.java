package CoreJavaAssignment;

public class StringSearch extends AbstractSearch {
    @Override
    public boolean search(Object[] objList, Object target) {
        if (target instanceof String) {
            String searchString = (String) target;
            for (Object obj : objList) {
                if (obj instanceof String && obj.equals(searchString)) {
                    return true;
                }
            }
        }
        return false;
    }
}
