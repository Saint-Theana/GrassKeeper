package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabWearBuffReq {
    @Tag(tag=3) public Integer buffId = null;
    @Tag(tag=5) public Boolean isMp = null;
    @Tag(tag=13) public Integer slotId = null;
}
