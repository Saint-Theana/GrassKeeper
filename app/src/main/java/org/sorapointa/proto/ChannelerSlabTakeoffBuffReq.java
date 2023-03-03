package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabTakeoffBuffReq {
    @Tag(tag=10) public Boolean isMp = null;
    @Tag(tag=12) public Integer slotId = null;
    @Tag(tag=9) public Integer buffId = null;
}
