FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR := "${PR}.1"

COMPATIBLE_MACHINE_kravlala = "kravlala"



KERNEL_FEATURES_append_kravlala += " cfg/smp.scc"

SRC_URI += "file://kravlala-standard.scc \
            file://kravlala-user-config.cfg \
            file://kravlala-user-features.scc \
           "

# replace these SRCREVs with the real commit ids once you've had
# the appropriate changes committed to the upstream linux-yocto repo
SRCREV_machine_pn-linux-yocto_kravlala ?= "${AUTOREV}"
SRCREV_meta_pn-linux-yocto_kravlala ?= "${AUTOREV}"
#LINUX_VERSION = "4.10"
#Remove the following line once AUTOREV is locked to a certain SRCREV
KERNEL_VERSION_SANITY_SKIP = "1"
