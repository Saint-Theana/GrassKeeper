package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class CustomDungeonBlock {
    @Tag(tag=15) public Integer blockId = null;
    @Tag(tag=2) public Vector rot = null;
    @Tag(tag=11) public Vector pos = null;
    @Tag(tag=1) public Integer guid = null;
}
