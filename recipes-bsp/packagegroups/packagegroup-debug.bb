DESCRIPTION = "Debugging tools"
SUMMATY = "This tools enables remote target debugging support"

inherit packagegroup

PACKAGES = "packagegroup-debug"

RDEPENDS_packagegroup-debug = "\
							packagegroup-core-eclipse-debug \
							packagegroup-core-tools-debug \
							packagegroup-core-ssh-openssh \
							"

