package CoreJavaAssignment;

public class IntegerSearch extends AbstractSearch {
	@Override
	public boolean search(Object[] objList, Object target) {
		if (target instanceof Integer) {
			int searchValue = (int) target;
			for(Object obj:objList) {
				if (obj instanceof Integer && (int) obj == searchValue) {
                    return true;
                }
			}
		}
		return false;
	}

}
