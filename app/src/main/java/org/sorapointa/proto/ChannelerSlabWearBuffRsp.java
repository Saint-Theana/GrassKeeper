package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabWearBuffRsp {
    @Tag(tag=15) public Integer buffId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Boolean isMp = null;
    @Tag(tag=8) public Integer slotId = null;
}
