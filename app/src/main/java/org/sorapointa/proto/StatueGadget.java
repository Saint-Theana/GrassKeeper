package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StatueGadget {
    @Tag(tag=1) public List<Integer> openedStatueUidList = new ArrayList<>();
}
