package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryUpgradeRsp {
    @Tag(tag=4) public Integer oldLevel = null;
    @Tag(tag=13) public Integer curLevel = null;
    @Tag(tag=9) public Long targetReliquaryGuid = null;
    @Tag(tag=2) public List<Integer> curAppendPropList = new ArrayList<>();
    @Tag(tag=6) public Integer powerUpRate = null;
    @Tag(tag=15) public List<Integer> oldAppendPropList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
