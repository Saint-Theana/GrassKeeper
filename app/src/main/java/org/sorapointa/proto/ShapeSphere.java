package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ShapeSphere {
    @Tag(tag=1) public Vector center = null;
    @Tag(tag=2,isFloat=true) public Float radius = null;
}
