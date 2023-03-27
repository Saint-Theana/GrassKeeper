package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekInfo {
    @Tag(tag=5) public List<Integer> visibleUidList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> caughtUidList = new ArrayList<>();
}
