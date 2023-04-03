package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class GeneralReward {
    @Tag(tag=1) public Integer resin = null;
    @Tag(tag=2) public Integer deadTime = null;
    @Tag(tag=3) public List<Integer> remainUidList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> qualifyUidList = new ArrayList<>();
    @Tag(tag=5) public ItemParam itemParam = null;
}
