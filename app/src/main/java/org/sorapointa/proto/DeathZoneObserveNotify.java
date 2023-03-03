package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DeathZoneObserveNotify {
    @Tag(tag=14) public Integer targetEntityId = null;
    @Tag(tag=12) public Integer sourceEntityId = null;
}
