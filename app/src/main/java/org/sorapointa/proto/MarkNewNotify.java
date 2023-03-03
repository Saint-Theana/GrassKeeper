package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MarkNewNotify {
    @Tag(tag=7) public List<Integer> idList = new ArrayList<>();
    @Tag(tag=11) public Integer markNewType = null;
}
