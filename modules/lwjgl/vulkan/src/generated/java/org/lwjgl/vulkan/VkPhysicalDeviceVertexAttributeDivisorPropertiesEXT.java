/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing max value of vertex attribute divisor that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code maxVertexAttribDivisor} &ndash; the maximum value of the number of instances that will repeat the value of vertex attribute data when instanced rendering is enabled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxVertexAttribDivisor;
 * }</code></pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVERTEXATTRIBDIVISOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxVertexAttribDivisor} field. */
    @NativeType("uint32_t")
    public int maxVertexAttribDivisor() { return nmaxVertexAttribDivisor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT set(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxVertexAttribDivisor}. */
    public static int nmaxVertexAttribDivisor(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.MAXVERTEXATTRIBDIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT, Buffer> {

        private static final VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code maxVertexAttribDivisor} field. */
        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nmaxVertexAttribDivisor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.npNext(address(), value); return this; }

    }

}