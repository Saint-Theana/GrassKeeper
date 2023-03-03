package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabOneOffDungeonInfoRsp {
    @Tag(tag=3) public List<Integer> schemeBuffIdList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
