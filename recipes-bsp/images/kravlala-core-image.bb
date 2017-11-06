DESCRIPTION = "Custom image, based on core-image-minimal"
SUMMARY = "This image intended for installing on beaglebone black and provides debugging tools and Qt libriary support"
LICENSE = "GPLv3"

inherit core-image
include core-image-minimal.bb 
hostname_pn-base-files = "kravlala"

IMAGE_FSTYPES = "tar.gz cpio.gz squashfs"

IMAGE_INSTALL += "\
				packagegroup-debug \
				packagegroup-qt5 \
				ninvaders\
				"