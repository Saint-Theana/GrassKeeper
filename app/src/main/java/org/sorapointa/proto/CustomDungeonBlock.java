package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class CustomDungeonBlock {
    @Tag(tag=8) public Integer blockId = null;
    @Tag(tag=12) public Vector rot = null;
    @Tag(tag=4) public Integer guid = null;
    @Tag(tag=1) public Vector pos = null;
}
