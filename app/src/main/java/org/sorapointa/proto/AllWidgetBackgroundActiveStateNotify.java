package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AllWidgetBackgroundActiveStateNotify {
    @Tag(tag=3) public List<Integer> backgroundActiveWidgetList = new ArrayList<>();
}
