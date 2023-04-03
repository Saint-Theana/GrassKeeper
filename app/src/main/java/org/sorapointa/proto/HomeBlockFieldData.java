package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.HomeBlockSubFieldData.*;
import org.sorapointa.proto.HomeBlockSubFieldData;

public class HomeBlockFieldData {
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=6) public Integer guid = null;
    @Tag(tag=9) public List<HomeBlockSubFieldData> subFieldList = new ArrayList<>();
    @Tag(tag=10) public Integer furnitureId = null;
    @Tag(tag=2) public Vector rot = null;
}
