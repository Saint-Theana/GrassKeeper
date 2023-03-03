package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeWidgetBackgroundActiveStateReq {
    @Tag(tag=15) public Boolean isActive = null;
    @Tag(tag=3) public Integer materialId = null;
}
