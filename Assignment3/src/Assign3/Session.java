package Assign3;

public class Session {

	private User user;
	public static int uAll = 0;
	public static int uIMgr = 1;
	public static int uPMgr = 2;
	public static int uAdmin = 3;

	public boolean canViewProductTemplates = false;
	public boolean canAddProductTemplates = false;
	public boolean canDeleteProductTemplates = false;
	public boolean canCreateProducts = false;
	public boolean canDeleteProducts = false;
	public boolean canViewInv = false;
	public boolean canAddInv = false;
	public boolean canDeleteInv = false;
	public boolean canViewParts = false;
	public boolean canAddParts = false;
	public boolean canDeleteParts = false;

	public Session(int role) {
		canViewInv = true;
		canViewParts = true;

		if (role == 1) {
			canAddInv = true;
			canAddParts = true;
		}

		if (role == 2) {
			canViewProductTemplates = true;
			canAddProductTemplates = true;
			canDeleteProductTemplates = true;
			canCreateProducts = true;
		}
		if (role == 3) {
			canViewProductTemplates = true;
			canAddProductTemplates = true;
			canDeleteProductTemplates = true;
			canCreateProducts = true;
			canAddInv = true;
			canAddParts = true;
			canDeleteParts = true;
			canDeleteInv = true;
		}
	}

	public Session(User user) {
		canViewInv = true;
		canViewParts = true;

		if (user.getPermission() == 1) {
			canAddInv = true;
			canAddParts = true;
		}

		if (user.getPermission() == 2) {
			canViewProductTemplates = true;
			canAddProductTemplates = true;
			canDeleteProductTemplates = true;
			canCreateProducts = true;
		}
		if (user.getPermission() == 3) {
			canViewProductTemplates = true;
			canAddProductTemplates = true;
			canDeleteProductTemplates = true;
			canCreateProducts = true;
			canAddInv = true;
			canAddParts = true;
			canDeleteParts = true;
			canDeleteInv = true;
		}
	}

	public boolean getAddPart() {
		return canAddParts;
	}

	public boolean getViewProduct() {
		return canViewProductTemplates;
	}

	public boolean getAddProduct() {
		return canAddProductTemplates;
	}

	public boolean getCreateProduct() {
		return canCreateProducts;
	}

	public boolean getDeleteProduct() {
		return canDeleteProducts;
	}

	public boolean getViewInventory() {
		return canViewInv;
	}

	public boolean getAddInventory() {
		return canAddInv;
	}

	public boolean getDeleteInventory() {
		return canDeleteInv;
	}

	public boolean getViewParts() {
		return canViewParts;
	}

	public boolean getDeleteParts() {
		return canDeleteParts;
	}
}
