package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TaskVar {
    @Tag(tag=8) public Integer key = null;
    @Tag(tag=6,isSigned=true) public List<Integer> valueList = new ArrayList<>();
}
