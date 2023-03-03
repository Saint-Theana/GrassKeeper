package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabBuffSchemeInfo {
    public static class MapSlotMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=9) public List<MapSlotMap> slotMap = new ArrayList<>();
    @Tag(tag=13) public Integer totalEnergy = null;
    @Tag(tag=15) public Integer selfEnergy = null;
}
