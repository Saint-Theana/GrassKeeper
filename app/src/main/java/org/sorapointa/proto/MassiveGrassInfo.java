package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MassiveGrassInfo {
    @Tag(tag=1) public Integer id = null;
    @Tag(tag=2) public Vector center = null;
    @Tag(tag=3) public Vector size = null;
}
