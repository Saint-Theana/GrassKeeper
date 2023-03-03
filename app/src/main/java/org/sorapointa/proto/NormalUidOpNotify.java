package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NormalUidOpNotify {
    @Tag(tag=6) public Integer duration = null;
    @Tag(tag=4) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> paramUidList = new ArrayList<>();
    @Tag(tag=8) public Integer paramIndex = null;
}
