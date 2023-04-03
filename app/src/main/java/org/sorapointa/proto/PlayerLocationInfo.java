package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PlayerLocationInfo {
    @Tag(tag=7) public Vector rot = null;
    @Tag(tag=4) public Vector pos = null;
    @Tag(tag=9) public Integer uid = null;
}
