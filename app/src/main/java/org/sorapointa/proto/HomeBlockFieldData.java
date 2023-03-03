package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeBlockSubFieldData.*;
import org.sorapointa.proto.HomeBlockSubFieldData;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeBlockFieldData {
    @Tag(tag=15) public Vector rot = null;
    @Tag(tag=4) public Vector pos = null;
    @Tag(tag=9) public Integer guid = null;
    @Tag(tag=1) public Integer furnitureId = null;
    @Tag(tag=7) public List<HomeBlockSubFieldData> subFieldList = new ArrayList<>();
}
