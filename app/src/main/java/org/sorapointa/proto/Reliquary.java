package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Reliquary {
    @Tag(tag=1) public Integer level = null;
    @Tag(tag=2) public Integer exp = null;
    @Tag(tag=3) public Integer promoteLevel = null;
    @Tag(tag=4) public Integer mainPropId = null;
    @Tag(tag=5) public List<Integer> appendPropIdList = new ArrayList<>();
}
