package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryPromoteRsp {
    @Tag(tag=10) public Integer oldPromoteLevel = null;
    @Tag(tag=6) public Long targetReliquaryGuid = null;
    @Tag(tag=9) public List<Integer> curAppendPropList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer curPromoteLevel = null;
    @Tag(tag=8) public List<Integer> oldAppendPropList = new ArrayList<>();
}
