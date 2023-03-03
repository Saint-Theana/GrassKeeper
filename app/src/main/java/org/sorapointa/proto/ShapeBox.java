package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ShapeBox {
    @Tag(tag=1) public Vector center = null;
    @Tag(tag=2) public Vector axis0 = null;
    @Tag(tag=3) public Vector axis1 = null;
    @Tag(tag=4) public Vector axis2 = null;
    @Tag(tag=5) public Vector extents = null;
}
