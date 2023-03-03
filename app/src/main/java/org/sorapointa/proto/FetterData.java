package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FetterData {
    @Tag(tag=1) public Integer fetterId = null;
    @Tag(tag=2) public Integer fetterState = null;
    @Tag(tag=3) public List<Integer> condIndexList = new ArrayList<>();
}
