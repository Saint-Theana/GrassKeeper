package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientGadget {
    @Tag(tag=1) public Integer campId = null;
    @Tag(tag=2) public Integer campType = null;
    @Tag(tag=3) public Long guid = null;
    @Tag(tag=4) public Integer ownerEntityId = null;
    @Tag(tag=5) public Integer targetEntityId = null;
    @Tag(tag=6) public Boolean asyncLoad = null;
    @Tag(tag=7) public Boolean isPeerIdFromPlayer = null;
    @Tag(tag=8) public List<Integer> targetEntityIdList = new ArrayList<>();
}
