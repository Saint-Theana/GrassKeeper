package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MassivePropParam {
    @Tag(tag=1,isSigned=true) public Integer type = null;
    @Tag(tag=2) public List<Integer> reactionInfoList = new ArrayList<>();
    @Tag(tag=3,isFloat=true) public List<Float> paramList = new ArrayList<>();
    @Tag(tag=4) public Integer syncFlag = null;
}
