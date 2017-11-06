DESCRIPTION = "Core Qt tools"
SUMMATY = "This tools include Qt libriary in the result image"

inherit packagegroup

PACKAGES = "packagegroup-qt5"

RDEPENDS_packagegroup-qt5 = "\
							qtbase \
							qttools\
							qtserialport\
							"
