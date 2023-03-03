package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetPlayUidOpNotify {
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=2) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=6) public Integer playType = null;
    @Tag(tag=1) public String paramStr = null;
    @Tag(tag=7) public Integer op = null;
    @Tag(tag=4) public List<Integer> paramList = new ArrayList<>();
}
