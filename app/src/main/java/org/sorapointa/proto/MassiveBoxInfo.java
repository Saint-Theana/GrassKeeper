package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MassiveBoxInfo {
    @Tag(tag=1,isSigned=true) public Integer id = null;
    @Tag(tag=2) public Integer configId = null;
    @Tag(tag=3) public Vector center = null;
    @Tag(tag=4) public Vector extents = null;
    @Tag(tag=5) public Vector up = null;
    @Tag(tag=6) public Vector forward = null;
    @Tag(tag=7) public Vector right = null;
}
